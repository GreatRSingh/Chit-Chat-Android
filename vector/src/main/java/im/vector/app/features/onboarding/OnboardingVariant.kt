/*
 * Copyright 2021-2024 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only
 * Please see LICENSE in the repository root for full details.
 */

package im.vector.app.features.onboarding

import android.content.Intent

interface OnboardingVariant {
    fun onNewIntent(intent: Intent?)
    fun initUiAndData(isFirstCreation: Boolean)
    fun setIsLoading(isLoading: Boolean)
}
