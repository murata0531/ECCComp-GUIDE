package com.example.ecccompguide.ui.gallery

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
import com.google.android.gms.maps.MapView

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
//        galleryViewModel =
//                ViewModelProvider(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
//        val textView: TextView = root.findViewById(R.id.text_gallery)
//        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })

        //val myMapView = root.findViewById(R.id.text_gallery) as MapView
        val myWebView: WebView = root.findViewById(R.id.text_gallery)
        val settings = myWebView!!.settings
        settings.javaScriptEnabled = true
        myWebView!!.setWebViewClient(WebViewClient())
        myWebView.loadUrl("https://www.google.co.jp/maps/place/ECC%E3%82%B3%E3%83%B3%E3%83%94%E3%83%A5%E3%83%BC%E3%82%BF%E5%B0%82%E9%96%80%E5%AD%A6%E6%A0%A1/@34.7064368,135.5010341,17z/data=!4m5!3m4!1s0x6000e69449e0775d:0x9dffc5eb4ec5cedf!8m2!3d34.7064324!4d135.5032228?hl=ja")


        return root
    }
}