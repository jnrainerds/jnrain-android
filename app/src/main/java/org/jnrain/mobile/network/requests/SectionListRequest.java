/*
 * Copyright 2012 JNRain
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
package org.jnrain.mobile.network.requests;

import org.jnrain.kbs.collection.ListSections;

import com.octo.android.robospice.request.springandroid.SpringAndroidSpiceRequest;


public class SectionListRequest
        extends SpringAndroidSpiceRequest<ListSections> {
    public SectionListRequest() {
        super(ListSections.class);
    }

    @Override
    public ListSections loadDataFromNetwork() throws Exception {
        return getRestTemplate().getForObject(
        /* "http://rhymin.jnrain.com/api/sec/", */
        "http://bbs.jnrain.com/rainstyle/sec_json.php", ListSections.class);
    }
}
