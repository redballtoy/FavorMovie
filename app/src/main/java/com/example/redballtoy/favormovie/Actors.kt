package com.example.redballtoy.favormovie


class Actors {
    private val actorsList: List<ActorsItem>

    init {
        actorsList = listOf(
                ActorsItem(1, R.drawable.chris_evans, R.string.chris_evans),
                ActorsItem(2, R.drawable.chris_hemsworth, R.string.chris_hemsworth),
                ActorsItem(3, R.drawable.mark_ruffalo, R.string.mark_ruffalo),
                ActorsItem(4, R.drawable.robert_downey, R.string.robert_downey),
                ActorsItem(5, R.drawable.chris_evans, R.string.chris_evans),
                ActorsItem(6, R.drawable.chris_hemsworth, R.string.chris_hemsworth),
                ActorsItem(7, R.drawable.mark_ruffalo, R.string.mark_ruffalo),
                ActorsItem(8, R.drawable.robert_downey, R.string.robert_downey)
        )
    }

    fun getItemFromList(id: Int): ActorsItem {
        return actorsList[id]
    }

    fun getCount(): Int {
        return actorsList.size
    }

    fun getListActors(): List<ActorsItem> {
        return actorsList
    }

    data class ActorsItem(
            val id: Int,
            val actorPictureId: Int,
            val actorNameId: Int
    )


}
