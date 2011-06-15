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
import android.widget.EditText;

public class Login extends Activity implements OnClickListener {
    private EditText uf, pf, sf;
    private Button lb;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        uf = (EditText) findViewById(R.id.user_field);
        pf = (EditText) findViewById(R.id.pass_field);
        sf = (EditText) findViewById(R.id.server_field);
        lb = (Button) findViewById(R.id.login_button);
        
        lb.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.equals(lb)) {
            // TODO Check valid user/pw/server input
            // TODO Attempt login with server
            // TODO proceed to next activity.
        	
        	Intent intent = new Intent(this, PatientInfoForm.class);
        	startActivity(intent);
        }
        
    }
}