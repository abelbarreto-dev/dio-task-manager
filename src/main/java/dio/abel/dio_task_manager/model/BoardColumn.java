package dio.abel.dio_task_manager.model;

import dio.abel.dio_task_manager.enums.TypeColumnEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardColumn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, length = 100)
    @Enumerated(EnumType.ORDINAL)
    private TypeColumnEnum kind;
    private int order;

    @ManyToOne
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    @OneToMany(mappedBy = "card", cascade = CascadeType.REFRESH)
    private List<Card> cards;
}
