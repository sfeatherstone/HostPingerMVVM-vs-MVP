package uk.co.wedgetech.hostpinger.ui.common

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import uk.co.wedgetech.hostpinger.R
import uk.co.wedgetech.hostpinger.model.Host

class HostsAdapter : RecyclerView.Adapter<HostCardHolder>() {

    private var items: List<Host> = List<Host>(0,{Host("","","")})

    fun setHosts(hosts :List<Host>) {
        items = hosts
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HostCardHolder {
        val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.card_host, parent, false)
        return HostCardHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: HostCardHolder, position: Int) {
        return holder.bindHost(items[position])
    }

}