/**
 * Copyright(C) 2010-2014 Samsung Electronics Co., Ltd. All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
*/
package com.sec.ose.osi.ui;

import com.sec.ose.osi.sdk.SDKInterface;
import com.sec.ose.osi.sdk.SDKInterfaceImpl;

/**
 * UISDKInterfaceManager
 * @author suhyun47.kim, hankido.lee
 * 
 */
public class UISDKInterfaceManager {

	private static SDKInterface sdkInterface =SDKInterfaceImpl.getInstance();

	public static SDKInterfaceImpl getSDKInterface() {
		return (SDKInterfaceImpl) sdkInterface;
	}

	public static void setSDKInterface(SDKInterface sdkInterface) {
		UISDKInterfaceManager.sdkInterface = sdkInterface;
	}

}
