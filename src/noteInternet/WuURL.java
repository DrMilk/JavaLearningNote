package noteInternet;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2017/7/13.
 *
 * URL(Uniform Resource Locator)：统一资源定位符，它表示 Internet 上某一资源的地址。通过 URL
 * 我们可以访问 Internet 上的各种网络资源，比如最常见的 www，ftp 站点。
 * 浏览器通过解析给定的 URL 可以在网络上查找相应的文件或其他资源。
 * URL的基本结构由5部分组成：
 * <传输协议>://<主机名>:<端口号>/<文件名>
 * 例如: http://192.168.1.100:8080/helloworld/index.jsp

 */
public class WuURL {
    public void testURL() throws Exception {
        URL url = new URL("http://www.xzw.com/astro/taurus/");
        URLConnection uc =url.openConnection();
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(uc);
        InputStream is = uc.getInputStream();
        OutputStream os = new FileOutputStream("F:\\测试1.txt");
        int len = 0;
        byte [] buffer = new byte[1024];
        while ((len = is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        is.close();
        os.close();


    }
}
