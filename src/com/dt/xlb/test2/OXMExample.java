package com.dt.xlb.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lb.xiao on 2018/7/30.
 */
public class OXMExample {
    private static final String FILE_NAME = "simplebean.xml";
    private SimpleBean simpleBean;

    private Marshaller marshaller;
    private Unmarshaller unmarshaller;

    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }

    public void saveSimpleBean() throws IOException {
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(FILE_NAME);
            this.marshaller.marshal(simpleBean, new StreamResult(os));
        } finally {
            if (os != null) {
                os.close();
            }
        }
    }

    public void loadSimpleBean() throws IOException {
        FileInputStream is = null;
        try {
            is = new FileInputStream(FILE_NAME);
            this.simpleBean = (SimpleBean) this.unmarshaller.unmarshal(new StreamSource(is));
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring-config.xml");
        OXMExample ex = (OXMExample) ct.getBean("oxmExample");
        ex.go();
    }

    private void go() throws IOException {
        simpleBean = new SimpleBean();
        //saveSimpleBean();
        loadSimpleBean();
        System.out.println("name: " + simpleBean.getUser().getName());
        System.out.println("age: " + simpleBean.getUser().getAge());
        System.out.println("job description: " + simpleBean.getJobDescription());
    }


    private SimpleBean getSimpleBean() {
        SimpleBean simpleBean = new SimpleBean();
//        simpleBean.setAge(40);
//        //simpleBean.setExecutive(false);
//        simpleBean.setJobDescription("这是张三的描述");
//        simpleBean.setName("张三");

        return simpleBean;

    }
}
