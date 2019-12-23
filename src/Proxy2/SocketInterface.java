package Proxy2;

// 5. To support plug-compatibility between
// the wrapper and the target, create an interface
public interface SocketInterface {
    String readLine();
    void  writeLine(String str);
    void  dispose();
}
