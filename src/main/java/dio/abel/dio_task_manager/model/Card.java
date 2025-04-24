package dio.abel.dio_task_manager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;
    @Column(length = 500)
    private String description;
    private boolean lock;

    private OffsetDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "board_column_id", nullable = false)
    private BoardColumn column;

    @OneToMany(mappedBy = "block_id", cascade = CascadeType.REFRESH)
    private List<Block> cards;
}
