package com.example.tuanpham.pgcasestudy.data;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by tuanpham on 11/4/17.
 */

public interface ItemsRepository {

    interface GetStoryCallback {
        void onItemLoaded(Story item);
    }

    interface GetCommentCallback {
        void onItemLoaded(Comment item);
    }

    interface GetTopStoryIdsCallback {
        void onTopStoryIdsLoaded(List<Story> stories);
    }

    void getTopStories(@NonNull GetTopStoryIdsCallback callback);

    void getStory(@NonNull int storyId, @NonNull GetStoryCallback callback);

    void getComment(@NonNull int commentID, @NonNull GetCommentCallback callback);
}
