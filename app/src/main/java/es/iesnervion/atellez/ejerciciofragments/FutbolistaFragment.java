package es.iesnervion.atellez.ejerciciofragments;

import android.app.ListFragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by atellez on 24/11/16.
 */

public class FutbolistaFragment extends ListFragment {
    OnHeadlineSelectedListener mCallback;

    public interface OnHeadlineSelectedListener{
        public void onFutbolistaSelected(int position);
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB ?
                android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_list_item_1;

        setListAdapter(new ArrayAdapter<String>(getActivity(), layout, Ipsum.Headlines));
    }

    public void onStart(){
        super.onStart();

        if(getFragmentManager().findFragmentById(R.id.article_fragment) != null){
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }
    }

    public void onAttach(Context context){
        super.onAttach(context);
        try {
            mCallback = (OnHeadlineSelectedListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString()+ "must implement OnHeadlineSelectedListener");
        }
    }
    public void onListItemClick(ListView l, View v, int position, long id){
        mCallback.onFutbolistaSelected(position);

        getListView().setItemChecked(position,true);
    }
}
