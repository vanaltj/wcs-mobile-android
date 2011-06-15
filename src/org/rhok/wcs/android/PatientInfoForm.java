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
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PatientInfoForm extends Activity {
	/** Called when the activity is first created. */
	private Button _nextButton;
	private Button _previousButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pinfo);
        
        _nextButton = (Button) findViewById(R.id.button_next);
        
        _nextButton.setOnClickListener(_nextListener);
    }
    
    /////////////////////
    // CLICK LISTENERS
    /////////////////////
    OnClickListener _nextListener = new OnClickListener()
    {
    	public void onClick(View view)
    	{
    		Intent intent = new Intent(PatientInfoForm.this, LocationSelect.class);
    		PatientInfoForm.this.startActivity(intent);
    	}
    };
}
