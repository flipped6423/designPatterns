package com.xp.designpatterns.behavioral.chanofResponsibility;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 支付处理器抽象类
 */
@Data
@RequiredArgsConstructor
public abstract class PaymentHandler {
    /**
     * 支付类型
     */
    private final int type;

    /**
     * 下一个支付处理器
     */
    private PaymentHandler nextHandler;

    /**
     * 处理支付处理器请求（模板方法）
     */
    public final void handleRequest(PaymentRequest request){
        if(request.getType() == type){
            System.out.println("找到对应的支付处理器");
            process(request);
        }else {
            if(nextHandler != null){
                System.out.println("找不到对应的支付处理器，将请求转发给下一个处理器");
                nextHandler.handleRequest(request);
            }else {
                System.out.println("支付链处理完成");
            }
        }
    }

    /**
     * 处理器实现类具体处理逻辑
     * @param request
     */
    protected abstract void process(PaymentRequest request);

}
