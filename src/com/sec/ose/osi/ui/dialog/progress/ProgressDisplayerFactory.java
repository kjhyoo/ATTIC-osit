/**
 * Copyright (c) 2010-2014 Samsung Electronics Co., Ltd. All rights reserved.
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
package com.sec.ose.osi.ui.dialog.progress;

import java.awt.Dimension;
import java.awt.Frame;

import com.sec.ose.osi.ui._util.WindowUtil;
import com.sec.ose.osi.ui.dialog.ProgressDisplayer;

/**
 * ProgressDisplayerFactory
 * @author suhyun47.kim
 *
 */
public class ProgressDisplayerFactory {

	public static ProgressDisplayer getProgressDisplayer(Frame owner, int pRequestCode) {
		
		String title = ProgressDictionary.getJDlgProgressTitle(pRequestCode);
		Dimension size = ProgressDictionary.getJDlgProgressSize(pRequestCode);

		displayer.setTitlePrefix(title);
		displayer.setSize(size);
		
		WindowUtil.locateCenter(displayer);
		
		return displayer; 
	}
	
	static JDlgProgress displayer = new JDlgProgress();
	public boolean isCancled() {
		return displayer.isCancled();
	}
}
