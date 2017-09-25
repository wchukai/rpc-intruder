package com.chulung.rpcintruder.client;

import com.chulung.service.HelloWorldServie;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by chulung on 2017/9/23.
 */
public class ServiceFactoryBeanTest {
    @Test
    public void createProxy() throws Exception {
        HelloWorldServie helloWorldServie = new ServiceFactoryBean().createProxy(HelloWorldServie.class);
        assertThat(helloWorldServie.getClass().getName().split("\\$\\$")[0]).isEqualTo(HelloWorldServie.class.getName());
    }
}