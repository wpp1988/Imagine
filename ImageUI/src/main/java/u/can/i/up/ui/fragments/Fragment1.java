package u.can.i.up.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import u.can.i.up.ui.R;
import u.can.i.up.ui.factories.FaceConversionUtil;


public class Fragment1 extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				FaceConversionUtil.getInstace().getFileText(getActivity());
//			}
//		}).start();
		return inflater.inflate(R.layout.fragment1, null);
	}	
}