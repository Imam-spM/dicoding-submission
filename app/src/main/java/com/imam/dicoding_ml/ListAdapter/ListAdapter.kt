package com.imam.dicoding_ml.ListAdapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.imam.dicoding_ml.model.ModelHero
import com.imam.dicoding_ml.R
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.Glide
import com.imam.dicoding_ml.DetailActivity

class ListAdapter (
    private val listAdapter: ArrayList<ModelHero>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_char_item, parent, false)
            return ListViewHolder(view)
        }

        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            val context = holder.itemView.context
            val ModelHero = listAdapter[position]
            Glide.with(holder.itemView.context)
                .load(ModelHero.pic)
                .apply(RequestOptions())
                .into(holder.picture)
            holder.name.text = ModelHero.name
            holder.role.text = ModelHero.role
            holder.nickname.text = ModelHero.nickname
            holder.itemView.setOnClickListener {
                val passItem = Intent(context, DetailActivity::class.java)
                passItem.putExtra(DetailActivity.EXTRA_NAME, ModelHero.name)
                passItem.putExtra(DetailActivity.EXTRA_ROLE, ModelHero.role)
                passItem.putExtra(DetailActivity.EXTRA_NICKNAME, ModelHero.nickname)
                passItem.putExtra(DetailActivity.EXTRA_INTRO, ModelHero.bio)
                passItem.putExtra(DetailActivity.EXTRA_PIC, ModelHero.pic)
                passItem.putExtra(DetailActivity.EXTRA_PICBG, ModelHero.background)
                passItem.putExtra(DetailActivity.EXTRA_ELEMENT, ModelHero.element)
                context.startActivity(passItem)
            }
        }

        override fun getItemCount(): Int {
            return listAdapter.size
        }

        inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var name: TextView = itemView.findViewById(R.id.char_name)
            var role: TextView = itemView.findViewById(R.id.char_role)
            var nickname: TextView = itemView.findViewById(R.id.char_nickname)
            var picture: ImageView = itemView.findViewById(R.id.char_pic)
        }
}