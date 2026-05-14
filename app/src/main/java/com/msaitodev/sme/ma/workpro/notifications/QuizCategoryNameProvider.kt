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
            "01_fundamentals" -> R.string.cat_01_fundamentals
            "02_process" -> R.string.cat_02_process
            "03_legal" -> R.string.cat_03_legal
            "04_finance" -> R.string.cat_04_finance
            "05_pmi" -> R.string.cat_05_pmi
            "unclassified" -> R.string.cat_unclassified
            else -> null
        }

        return if (resId != null) {
            context.getString(resId)
        } else {
            // マッピングがない場合は ID をそのまま返し、不備に気づきやすくする
            categoryId
        }
    }
}