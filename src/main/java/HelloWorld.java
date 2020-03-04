import cn.zhouyafeng.itchat4j.Wechat;
import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import cn.zhouyafeng.itchat4j.api.MessageTools;


public class HelloWorld {
    public static void main(String[] args) {
        String qrPath = "/Users/ahuang/Documents/Projects/ahuang/com.webot/static/login"; // 保存登陆二维码图片的路径，这里需要在本地新建目录
        IMsgHandlerFace msgHandler = new SimpleDemo(); // 实现IMsgHandlerFace接口的类
        Wechat wechat = new Wechat(msgHandler, qrPath); // 【注入】
        wechat.start();
        MessageTools messageTools = new MessageTools();
        messageTools.sendMsgByNickName("jfdhfjd", "兀凌夏Natsuko");
    }
}
