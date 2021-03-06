package com.vacuum.avaz.ui.list

import com.vacuum.avaz.ui.base.BaseContract
import com.vacuum.avaz.models.DetailsViewModel
import com.vacuum.avaz.models.Post

/**
 * Created by ogulcan on 07/02/2018.
 */
class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}