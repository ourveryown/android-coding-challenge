package au.com.ourveryown.ovoandroidhomeworktask

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


// Returns the mock data stored in SavedJobsResponse.json
// No need to edit or test

class SavedJobsClient(val applicationContext: Context) {
    fun getSavedJobs(page: Int, completion: (Map<String, Any>?, error: Exception?) -> Unit) {
        try {
            val data: String = applicationContext.assets.open("SavedJobsResponsePage$page.json").bufferedReader().use {it.readText()}
            val savedJobs = Gson().fromJson<Map<String, Any>>(data, object: TypeToken<Map<String, Any>>(){}.type)

            completion(savedJobs, null)
        } catch (e: Exception) {
            completion(null, e)
        }
    }
}