package com.example.redballtoy.favormovie
//https://www.youtube.com/watch?v=cDF_yBCflXk&list=PLAma_mKffTOT_bGrVruy1_JxkFLjh5sfF&index=15&ab_channel=alishev


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView


class ActorsAdapter(
        private val list: Actors)
    : RecyclerView.Adapter<ActorsAdapter.ActorViewHolder>() {

    //это обертка для actors_íst_item = itemView
    class ActorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val actorPicture: ImageView = view.findViewById(R.id.iv_actor_foto)
        val actorName: TextView = view.findViewById(R.id.tv_actor_name)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val viewCell = LayoutInflater.from(parent.context)
                .inflate(R.layout.actors_list_item, parent, false)
        return ActorViewHolder(viewCell)
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        val data = list.getItemFromList(position)
        holder.actorPicture.setImageDrawable(ContextCompat
                .getDrawable(holder.itemView.context, data.actorPictureId))
        holder.actorName.setText(data.actorNameId)
    }

    //возвращает общее элементов в списке
    override fun getItemCount(): Int {
        return list.getCount()
    }
}