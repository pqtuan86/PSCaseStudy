package com.example.tuanpham.pgcasestudy.stories;

import android.support.annotation.Nullable;

import com.example.tuanpham.pgcasestudy.data.Story;

import java.util.List;

/**
 * Created by tuanpham on 11/1/17.
 */

public interface StoriesContract {

    interface View {
        void setProgressIndicator(boolean active);

        void showItems(List<Story> stories);

        void showItemDetail(Story story);

        void populateStoryDetails(Story story);
    }

    interface UserActionsListener {

        void getTopStories();

        void openItem(@Nullable Story selectedStory);

        void getStory(int storyId);
    }
}
