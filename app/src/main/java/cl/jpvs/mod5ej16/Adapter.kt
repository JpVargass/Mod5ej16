package cl.jpvs.mod5ej16

import android.media.RouteListingPreference.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.jpvs.mod5ej16.databinding.ItemLoyoutBinding
import coil.load

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>(){
  var paises = mutableListOf<Pais>()
  var callback: PaisCallback? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding = ItemLoyoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = paises [position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return paises.size
    }
    fun setData(listaPaises : List<Pais>){
        this.paises = listaPaises.toMutableList()
    }

    inner class ViewHolder (val binding: ItemLoyoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Pais) {
            val texto = "Pais: ${item.nombre} Poblacion: ${item.poblacion}"

            binding.textViewPais.text = item.nombre
            binding.imageViewPais.load(item.imgUrl)

            binding.cardViewItem.setOnClickListener(View.OnClickListener {

                callback?.showcountry(texto)
            })

            }

        }

    }
interface PaisCallback {
    fun showcountry(texto : String)
}