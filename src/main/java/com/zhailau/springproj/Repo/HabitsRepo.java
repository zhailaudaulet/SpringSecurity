package com.zhailau.springproj.Repo;

import com.zhailau.springproj.Data.Habits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitsRepo extends JpaRepository<Habits, Long> {
}
