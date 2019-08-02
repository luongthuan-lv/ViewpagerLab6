package vn.edu.poly.viewpagerlab6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter {
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        FragmentView fragmentView=new FragmentView();
        Bundle bundle=new Bundle();
        bundle.putString("hs",position+"");
        fragmentView.setArguments(bundle);
        return fragmentView;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return " TAB "+position;
    }


}
