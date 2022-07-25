package com.xxd.designdemo.chapter16;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter16
 * @Author: xxd
 * @CreateTime: 2022-07-24  20:34
 * @Description: 抽象处理者
 * @Version: 1.0
 */
public abstract class Handler {
    private Handler nextHandler;

    public final Response handlerMessage(Request request){
            Response response = null;
            if(this.getHandlerLevel().equals(request.getRequestLevel())){
                response = this.echo(request);
            }else{
                if(this.nextHandler != null){
                    response = this.nextHandler.handlerMessage(request);
                }
            }
            return response;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    protected abstract Level getHandlerLevel();
    protected abstract Response echo(Request request);
}
