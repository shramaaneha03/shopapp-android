package com.shopapp.ui.product.di

import com.nhaarman.mockito_kotlin.mock
import com.shopapp.domain.interactor.cart.CartAddItemUseCase
import com.shopapp.domain.interactor.product.ProductDetailsUseCase
import com.shopapp.domain.interactor.product.ProductListUseCase
import com.shopapp.ui.product.contract.ProductDetailsPresenter
import com.shopapp.ui.product.contract.ProductListPresenter
import dagger.Module
import dagger.Provides

@Module
class TestProductModule {

    @Provides
    fun provideProductDetailsPresenter(
        productDetailsUseCase: ProductDetailsUseCase,
        cartAddItemUseCase: CartAddItemUseCase
    ): ProductDetailsPresenter = mock()

    @Provides
    fun provideProductListPresenter(productListUseCase: ProductListUseCase): ProductListPresenter =
        mock()
}