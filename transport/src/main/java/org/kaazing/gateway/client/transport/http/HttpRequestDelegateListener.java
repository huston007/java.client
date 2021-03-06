/**
 * Copyright 2007-2015, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaazing.gateway.client.transport.http;

import org.kaazing.gateway.client.transport.CloseEvent;
import org.kaazing.gateway.client.transport.ErrorEvent;
import org.kaazing.gateway.client.transport.LoadEvent;
import org.kaazing.gateway.client.transport.OpenEvent;
import org.kaazing.gateway.client.transport.ProgressEvent;
import org.kaazing.gateway.client.transport.ReadyStateChangedEvent;

public interface HttpRequestDelegateListener {

    void opened(OpenEvent event);
    void errorOccurred(ErrorEvent event);
    void readyStateChanged(ReadyStateChangedEvent event);
    void loaded(LoadEvent event);
    void progressed(ProgressEvent progressEvent);
    void closed(CloseEvent event);

}
