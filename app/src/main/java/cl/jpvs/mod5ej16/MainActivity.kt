package cl.jpvs.mod5ej16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import cl.jpvs.mod5ej16.databinding.ActivityMainBinding
import cl.jpvs.mod5ej16.databinding.ItemLoyoutBinding

/* Pasos para crear un recycler view
[  ] item layout
[ ] agregar constraints
[ ] cambiar altura de constraints layout de item layout a wrap content
[ ] definir ID
[  ] layout con recycler view
[ ] asignar layout manager
[ ] implementar clase Adapter
[ ]  heredar RecyclerView.Adapter
[ ] creaciones de los métodos: onCreateViewHolder, getItemCount y onBindViewHolder
[ ] crear clase anidada ViewHolder, que hereda de la clase ViewHolder
[ ] Agregar constructor
[ ] crear objeto, data class
[ ] Crear lista
[ ] asignar tamaño de la lista en getItemCount
[ ] definir Binding Class del Item
[ ] cambiar view por el binding
[ ] declarar variable item en onBindViewHolder
[ ] implementar binding en clase viewHolder
[ ] Adapter+ view holder
[ ] obtener los datos
* /*
* */
* */

class MainActivity : AppCompatActivity(), PaisCallback {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapter()
    }

    private fun initAdapter() {
       val adapter = Adapter()
       val listaDePaises = PaisesLatam.paises
       adapter.setData(listaDePaises)
       binding.recyclerView.adapter = adapter
        adapter.callback = this
    }

    override fun showcountry(s : String) {
      binding.textViewPoblacion.text = s
    }
}

