package ui.android.pro.userinterface;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ViewPagingActivity extends Activity {

    private static int NUMBER_IMAGES = 4;
    private ViewPagerAdapter viewPagerAdpater;
    private ViewPager viewPager;
    private int[] space = { R.drawable.stars480, R.drawable.plasma480, R.drawable.plasma720, R.drawable.plasma1080 };
    private static final String[] pageTitle = { "stars480.png", "galaxy480.png", "galaxy720.png", "galaxy1080.png" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpaging);

        viewPagerAdpater = new ViewPagerAdapter();

        viewPager = (ViewPager) findViewById(R.id.planetViewPager);
        viewPager.setAdapter(viewPagerAdpater);

        final PagerTitleStrip pagerTitle = (PagerTitleStrip) findViewById(R.id.pagerTitleStrip);
        pagerTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        pagerTitle.setTextColor(Color.CYAN);
        pagerTitle.setNonPrimaryAlpha(0.64f);
        pagerTitle.setTextSpacing(4);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_paging, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class ViewPagerAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            return NUMBER_IMAGES;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == ((ImageView) object);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // return super.getPageTitle(position);
            return pageTitle[position];
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            // return super.instantiateItem(container, position);
            ImageView spaceView = new ImageView(ViewPagingActivity.this);
            spaceView.setImageResource(space[position]);
            ((ViewPager) container).addView(spaceView, 0);
            return spaceView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            // super.destroyItem(container, position, object);
            ((ViewPager) container).removeView((ImageView) object);
        }

        @Override
        public Parcelable saveState() {
            // return super.saveState();
            return null;
        }

        @Override
        public void restoreState(Parcelable state, ClassLoader loader) {
            // super.restoreState(state, loader);
        }

        @Override
        public void startUpdate(ViewGroup container) {
            // super.startUpdate(container);
        }

        @Override
        public void finishUpdate(ViewGroup container) {
            // super.finishUpdate(container);
        }
    }
}
