package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.DialogTitle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView

open class DrawerBaseActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout

    override fun setContentView(view: View?) {
        drawerLayout = layoutInflater.inflate(R.layout.activity_drawer_base, null) as DrawerLayout
        var container: FrameLayout = drawerLayout.findViewById(R.id.activity_container)
        container.addView(view)
        super.setContentView(drawerLayout)


        var toolBar: Toolbar = drawerLayout.findViewById(R.id.tool_bar)
        setSupportActionBar(toolBar)

        var navigationView: NavigationView = drawerLayout.findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        var toggle: ActionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.menu_drawer_open, R.string.menu_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)
/*
        when (item.itemId){
            R.id.ic_home -> {
                var mainActivity = Intent(this, MainActivity::class.java)
                startActivity(mainActivity)
                item.isChecked = true
            }

            R.id.ic_customers -> {
                var customersActivity = Intent(this, CustomersActivity::class.java)
                startActivity(customersActivity)
                item.isChecked = true
            }

            R.id.ic_orders -> {
                var ordersActivity = Intent(this, OrdersActivity::class.java)
                startActivity(ordersActivity)
                item.isChecked = true
            }

            R.id.ic_brands -> {
                var brandsActivity = Intent(this, BrandsActivity::class.java)
                startActivity(brandsActivity)
                item.isChecked = true
            }

        }
        */
        return false
    }


    protected fun allocateActivityTitle(title: String) {
        supportActionBar?.setTitle(title)
    }
}