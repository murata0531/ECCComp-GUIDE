package com.example.ecccompguide.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.ecccompguide.MapsActivity
import com.example.ecccompguide.R
import com.google.android.gms.maps.OnMapReadyCallback

class SlideshowFragment : Fragment()  {

    private lateinit var slideshowViewModel: SlideshowViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
//        slideshowViewModel =
//                ViewModelProvider(this).get(SlideshowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
//        val textView: TextView = root.findViewById(R.id.text_slideshow)
//        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })

        val myWebView: WebView = root.findViewById(R.id.text_slideshow)
        val settings = myWebView!!.settings
        settings.javaScriptEnabled = true
        myWebView!!.setWebViewClient(WebViewClient())
        myWebView.loadUrl("http://falcon.ecc.ac.jp/ECCSTD/ST0100/ST0100_01.aspx")

        return root
    }
}