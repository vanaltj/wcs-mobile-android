/*
 * Copyright 2011 Jon VanAlten
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.rhok.wcs.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;

public class ConfirmAndSend extends Activity implements OnClickListener {
    private Spinner af;
    private Button sb;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.confirm_send);

	    af = (Spinner) findViewById(R.id.agespin);
	    
	    sb = (Button) findViewById(R.id.sendButton);
	    sb.setOnClickListener(this);
	    //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
	    //        this, R.array.planets_array, android.R.layout.simple_spinner_item);
	    //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    //spinner.setAdapter(adapter);
    }
	
    public void onClick(View v) {
        if (v.equals(sb)) {
            // TODO Send wound info to server.
        }
        
    }
	
}
