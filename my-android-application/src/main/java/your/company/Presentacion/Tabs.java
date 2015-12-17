package your.company.Presentacion;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import your.company.R;

@SuppressWarnings( "deprecation" )

/**
 * Created by user on 02/12/2015.
 */

public class Tabs extends FragmentActivity implements ActionBar.TabListener{
    ActionBar actionbar;
    ViewPager viewpager;
    FragmentPageAdapter ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interfaz_inicial_premium);
        viewpager = (ViewPager) findViewById(R.id.pager);
        ft = new FragmentPageAdapter(getSupportFragmentManager());
        actionbar = getActionBar();
        viewpager.setAdapter(ft);
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionbar.addTab(actionbar.newTab().setText("Votar").setTabListener(this));
        actionbar.addTab(actionbar.newTab().setText("Buscar Tapas").setTabListener(this));
//        actionbar.addTab(actionbar.newTab().setText("Buscar Bar").setTabListener(this));
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageSelected(int arg0) {
                actionbar.setSelectedNavigationItem(arg0);
            }
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
    }
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        viewpager.setCurrentItem(tab.getPosition());
    }
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
    }

}