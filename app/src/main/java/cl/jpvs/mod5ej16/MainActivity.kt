package cl.jpvs.mod5ej16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}