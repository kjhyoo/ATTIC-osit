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
package com.sec.ose.osi.ui.dialog.codeMatchAlarm;

import javax.swing.SwingWorker;

/**
 * RemainedSnippetAlarmThread
 * @author hankido.lee, suhyun47.kim
 *
 */
public class RemainedSnippetAlarmThread extends SwingWorker<Object, Object> {
	
	RemainedSnippetAlarmDlg refreshTableAlarmDlg = null;
	String content = null;

	public RemainedSnippetAlarmThread(
			RemainedSnippetAlarmDlg refreshTableAlarmDlg,
			String content) {
		this.refreshTableAlarmDlg = refreshTableAlarmDlg;
		this.content = content;
	}

	public void showDlg() {
		this.execute();
	}

	@Override
	protected Object doInBackground() throws Exception {
		refreshTableAlarmDlg.setTextPane(content);
		refreshTableAlarmDlg.setVisible(true);
    	return null;
	}
	
}
