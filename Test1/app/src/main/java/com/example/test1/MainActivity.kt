package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupTabLayout()
    }
    private fun setupTabLayout() {

        /*
        val selectedPosition = binding.tabLayout.selectedTabPosition
        binding.textView.text =
            getString(R.string.selected_tab, binding.tabLayout.getTabAt(selectedPosition)?.text)

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.textView.text = getString(R.string.selected_tab, tab?.text)
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Write code to handle tab reselect
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Write code to handle tab reselect
            }
        });

         */
    }
}