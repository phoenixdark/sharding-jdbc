/**
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.example.config;

import java.sql.SQLException;
import com.dangdang.ddframe.rdb.sharding.example.config.service.FooService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class SpringNamespaceMain {
    
    public static void main(final String[] args) throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        FooService service =  applicationContext.getBean(FooService.class);
        service.insert();
        service.select();
        service.delete();
        service.select();
    }
}