package by.andrew.pokemonsworld.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TypesAdapter(private val types: List<String>) :
    RecyclerView.Adapter<TypesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TypesViewHolder {
        return TypesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                android.R.layout.simple_list_item_1, parent, false
            )
        )
    }

    override fun getItemCount(): Int = types.size

    override fun onBindViewHolder(holder: TypesViewHolder, position: Int) {
        holder.typeTextView.text = types[position]
    }
}