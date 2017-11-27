package com.example.homework.screen.course.homework

import android.support.v7.widget.RecyclerView
import android.widget.TextView
import com.example.homework.base.IPresenter
import com.example.homework.base.IView
import com.example.homework.data.DO.course.CourseDetail
import com.example.homework.data.DO.course.Homework

/**
 * Created by 59800 on 2017/11/8.
 */

interface Contract {

    interface View : IView {
        fun setHomework(homework: Homework)
//        fun setAdapter(adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>)
//        fun setCourseDetail(courseDetail: CourseDetail)
//        fun setHomeworkDetail(homework: Homework)
//        fun gotoHomework()
    }

    interface Presenter: IPresenter {

    }
}