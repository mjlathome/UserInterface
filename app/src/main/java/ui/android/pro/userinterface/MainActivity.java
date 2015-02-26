package ui.android.pro.userinterface;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.widget.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends Activity {
    private final String TAG = "MainActivity";
    AnalogClock analogClock;
    TextView textView;
    VideoView introVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        introVideo = (VideoView) findViewById(R.id.videoView);
        Uri introVideoUri = Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.intro );
        // Uri introVideoUri = Uri.parse("https://archive.org/download/VideoGamesAndLearning/VideoGamesAndTangentialLearning_512kb.mp4");
        introVideo.setVideoURI(introVideoUri);
        MediaController introVideoMediaController = new MediaController(this);
        introVideoMediaController.setAnchorView(introVideo);
        introVideo.setMediaController(introVideoMediaController);
        introVideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        introVideo.start();

       // Pro Ui Chapter 11
       // taking it back to its roots for new layouts to come
//        ActionBar tabsActionBar = getActionBar();
//        Log.d( TAG, "ActionBar null = " + (tabsActionBar == null) );
//        if (tabsActionBar != null) {
//            tabsActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//            ActionBar.Tab tabArray = tabsActionBar.newTab();
//            tabArray.setText(R.string.tab_one);
//            tabArray.setTabListener(new clockTabListener(this, digitalClockFragment.class.getName()));
//            tabsActionBar.addTab(tabArray);
//            tabArray = tabsActionBar.newTab();
//            tabArray.setText(R.string.tab_two);
//            tabArray.setTabListener(new clockTabListener(this, analogClockFragment.class.getName()));
//            tabsActionBar.addTab(tabArray);
//        }

        // Pro UI Chapter 6
        // now uses tabs so original non-fragment layout is no longer required
//        setContentView(R.layout.activity_main);
//        textView = (TextView)findViewById(R.id.textView);
//        analogClock = (AnalogClock)findViewById(R.id.analogClock);
//
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                PopupMenu popupMenu = new PopupMenu(MainActivity.this, textView);
//                popupMenu.getMenuInflater().inflate(R.menu.main_popup, popupMenu.getMenu());
//                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
//                    public boolean onMenuItemClick(MenuItem item) {
//                        switch (item.getItemId()) {
//                            case R.id.viz:
//                                analogClock.setVisibility(View.VISIBLE);
//                                break;
//                            case R.id.inviz:
//                                analogClock.setVisibility(View.INVISIBLE);
//                                break;
//                            case R.id.gone:
//                                analogClock.setVisibility(View.GONE);
//                                break;
//                        }
//                        return false;
//                    }
//                });
//
//                popupMenu.show();
//            }
//        });
//
//        registerForContextMenu(analogClock);
//
//        Button goneButton =(Button)findViewById(R.id.clockGone);
//        goneButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                analogClock.setVisibility(View.GONE);
//            }
//        });
//
//        Button vizButton =(Button)findViewById(R.id.clockVisible);
//        vizButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                analogClock.setVisibility(View.VISIBLE);
//            }
//        });
//
//        Button invizButton =(Button)findViewById(R.id.clockInvisible);
//        invizButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                analogClock.setVisibility(View.INVISIBLE);
//            }
//        });

    }

    // Pro UI Chapter 6
    // now uses tabs so original non-fragment layout is no longer required
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        switch (id) {
//            case R.id.action_red:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.blood_red));
//                return true;
//            case R.id.action_org:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.burnt_orange));
//                return true;
//            case R.id.action_yel:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.banana_yellow));
//                return true;
//            case R.id.action_grn:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.forest_green));
//                return true;
//            case R.id.action_blu:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.ocean_blue));
//                return true;
//            case R.id.action_pur:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.deep_purple));
//                return true;
//            case R.id.action_wht:
//                analogClock.setBackgroundColor(Color.WHITE);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//
//    }
//
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        getMenuInflater().inflate(R.menu.main_context, menu);
//    }
//
//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//        switch ( item.getItemId() ) {
//            case R.id.red:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.blood_red));
//                return true;
//            case R.id.orange:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.burnt_orange));
//                return true;
//            case R.id.yellow:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.banana_yellow));
//                return true;
//            case R.id.green:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.forest_green));
//                return true;
//            case R.id.blue:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.ocean_blue));
//                return true;
//            case R.id.purple:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.deep_purple));
//                return true;
//            case R.id.invisible:
//                analogClock.setVisibility(View.INVISIBLE);
//                return true;
//            default:
//                return super.onContextItemSelected(item);
//        }
//    }

    // menu now used again in Ch12
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.linear_layout:
                Intent intent_ll = new Intent(this, LinearActivity.class);
                this.startActivity(intent_ll);
                break;
            case R.id.relative_layout:
                Intent intent_rl = new Intent(this, RelativeActivity.class);
                this.startActivity(intent_rl);
                break;
            case R.id.grid_layout:
                Intent intent_gl = new Intent(this, GridActivity.class);
                this.startActivity(intent_gl);
                break;
            case R.id.drawer_layout:
                Intent intent_dl = new Intent(this, DrawerActivity.class);
                this.startActivity(intent_dl);
                break;
            case R.id.sliding_layout:
                Intent intent_spl = new Intent(this, SlidingPaneActivity.class);
                this.startActivity(intent_spl);
                break;
            case R.id.paging_layout:
                Intent intent_vpl = new Intent(this, ViewPagingActivity.class);
                this.startActivity(intent_vpl);
                break;
        }
        return true;
    }

    private class clockTabListener implements ActionBar.TabListener {
        private final Activity currentActivity;
        private final String currentFragment;
        private Fragment launchFragment;

        public clockTabListener(Activity activityName, String fragmentName){
            currentActivity = activityName;
            currentFragment = fragmentName;
        }

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            launchFragment = Fragment.instantiate(currentActivity, currentFragment);
            ft.replace(android.R.id.content, launchFragment);
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.remove(launchFragment);
            launchFragment = null;
        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }
    }
}
