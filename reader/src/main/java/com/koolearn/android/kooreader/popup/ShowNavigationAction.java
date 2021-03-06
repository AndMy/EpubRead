package com.koolearn.android.kooreader.popup;

import com.koolearn.android.kooreader.KooAndroidAction;
import com.koolearn.android.kooreader.KooReader;
import com.koolearn.klibrary.text.model.ZLTextModel;
import com.koolearn.klibrary.text.view.ZLTextView;
import com.koolearn.kooreader.kooreader.KooReaderApp;

public class ShowNavigationAction extends KooAndroidAction {
	public ShowNavigationAction(KooReader baseActivity, KooReaderApp kooReaderApp) {
		super(baseActivity, kooReaderApp);
	}

	@Override
	public boolean isVisible() {
		final ZLTextView view = (ZLTextView)Reader.getCurrentView();
		final ZLTextModel textModel = view.getModel();
		return textModel != null && textModel.getParagraphsNumber() != 0;
	}

	@Override
	protected void run(Object ... params) {
		BaseActivity.navigate();
	}
}
