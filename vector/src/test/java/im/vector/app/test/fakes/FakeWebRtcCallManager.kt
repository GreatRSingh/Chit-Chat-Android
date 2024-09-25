/*
 * Copyright 2022-2024 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only
 * Please see LICENSE in the repository root for full details.
 */

package im.vector.app.test.fakes

import im.vector.app.features.call.webrtc.WebRtcCallManager
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.runs
import io.mockk.verify

class FakeWebRtcCallManager {

    val instance = mockk<WebRtcCallManager>()

    fun givenCheckForProtocolsSupportIfNeededSucceeds() {
        every { instance.checkForProtocolsSupportIfNeeded() } just runs
    }

    fun verifyCheckForProtocolsSupportIfNeeded() {
        verify { instance.checkForProtocolsSupportIfNeeded() }
    }
}
