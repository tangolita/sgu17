package ru.sgu.csiit.sgu17;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class PreviewFragment extends Fragment {

    private WebView webView;

    public PreviewFragment() {
        setArguments(new Bundle());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.preview_fragment, container, false);
        this.webView = (WebView) v.findViewById(R.id.preview_webview);
        reload();
        return v;
    }

    public void reload() {
        String url = getArguments().getString("url");
        webView.loadUrl(url);
    }

}
