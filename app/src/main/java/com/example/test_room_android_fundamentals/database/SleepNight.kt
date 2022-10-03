package com.example.test_room_android_fundamentals.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity(tableName = "bang_chat_luong_giac_ngu")
//data class SleepNight(
//    var id : Long = 0L,
//    val thoiGianBatDau : Long = System.currentTimeMillis(),
//    var thoiGianKetThuc : Long = thoiGianBatDau, // khởi tạo thời gian kết thúc đặt nó thành thời gian bắt đầu để cho biết chưa có thời gian kết thúc nào được ghi lại.
//    var  chatLuongGiacNgu : Int = -1  // hãy đặt nó thành -1, cho biết rằng không có dữ liệu chất lượng nào được thu thập.
//)

@Entity(tableName = "daily_sleep_quality_table")
data class SleepNight(
    @PrimaryKey(autoGenerate = true)
    var nightId: Long = 0L,

    @ColumnInfo(name = "start_time_milli")
    val startTimeMilli: Long = System.currentTimeMillis(),

    @ColumnInfo(name = "end_time_milli")
    var endTimeMilli: Long = startTimeMilli,

    @ColumnInfo(name = "quality_rating")
    var sleepQuality: Int = -1
)