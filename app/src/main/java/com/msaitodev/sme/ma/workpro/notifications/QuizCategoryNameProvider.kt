package com.msaitodev.sme.ma.workpro.notifications

import android.content.Context
import com.msaitodev.sme.ma.workpro.R
import com.msaitodev.quiz.core.domain.repository.CategoryNameProvider
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * クイズアプリ向けのカテゴリ名称供給実装。
 * ディレクトリ名（ID）を、Hub層の strings.xml に定義された日本語名に変換します。
 */
@Singleton
class QuizCategoryNameProvider @Inject constructor(
    @ApplicationContext private val context: Context
) : CategoryNameProvider {
    override fun getDisplayName(categoryId: String): String {
        val resId = when (categoryId) {
            "01_practice" -> R.string.cat_01_practice
            "02_ethics" -> R.string.cat_02_ethics
            "03_finance" -> R.string.cat_03_finance
            "04_legal" -> R.string.cat_04_legal
            "05_comprehensive" -> R.string.cat_05_comprehensive
            "unclassified" -> R.string.cat_unclassified
            else -> null
        }

        return if (resId != null) {
            context.getString(resId)
        } else {
            categoryId
        }
    }
}
