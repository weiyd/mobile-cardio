package ua.stu.view.adapter;

import java.util.List;

import javax.swing.text.AbstractDocument.Content;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

public class SamplePagerAdapter extends PagerAdapter {

	private List<View> pages = null;

	public SamplePagerAdapter(List<View> pages){
        this.pages = pages;
    }
    
    @Override
    public Object instantiateItem(View collection, int position){
        View v = pages.get(position);
        ((ViewPager) collection).addView(v, 0);
        return v;
    }
    
    @Override
    public void destroyItem(View collection, int position, Object view){
        ((ViewPager) collection).removeView((View) view);
    }
    
    @Override
    public int getCount(){
        return pages.size();
    }
    
    @Override
    public boolean isViewFromObject(View view, Object object){
        return view.equals(object);
    }

    @Override
    public void finishUpdate(View arg0){
    }

    @Override
    public void restoreState(Parcelable arg0, ClassLoader arg1){
    }

    @Override
    public Parcelable saveState(){
        return null;
    }

    @Override
    public void startUpdate(View arg0){
    }
}
