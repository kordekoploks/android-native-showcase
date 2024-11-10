package com.igorwojda.showcase.profile.presentation.screen.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.igorwojda.showcase.base.common.res.Dimen
import com.igorwojda.showcase.base.presentation.activity.BaseFragment
import com.igorwojda.showcase.base.presentation.compose.composable.PlaceholderImage
import com.igorwojda.showcase.base.presentation.compose.composable.UnderConstructionAnim

class ProfileFragment : BaseFragment() {

    var searchTextInputEditText: TextInputEditText? = null
    var searchLayout: LinearLayoutCompat? = null
    var searchTextInputLayout: TextInputLayout? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                ProfileScreen()
            }
        }
    }
}

@Composable
private fun ProfileScreen() {
    UnderConstructionAnim()
    Card {  }

}
