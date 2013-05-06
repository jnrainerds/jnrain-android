/*
 * Copyright 2013 JNRain
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.jnrain.mobile.network;

import org.jnrain.weiyu.entity.SimpleReturnCode;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.octo.android.robospice.request.springandroid.RestContentRequest;


public class LogoutRequest extends RestContentRequest<SimpleReturnCode> {
    public LogoutRequest() {
        super(SimpleReturnCode.class);
    }

    @Override
    public SimpleReturnCode loadDataFromNetwork() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        // request body intentionally empty

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> req = new HttpEntity<MultiValueMap<String, String>>(
                params,
                headers);

        return getRestTemplate().postForObject(
                /* "http://rhymin.jnrain.com/api/logout/", */
                "http://bbs.jnrain.com/rainstyle/apilogout.php",
                req,
                SimpleReturnCode.class);
    }
}
