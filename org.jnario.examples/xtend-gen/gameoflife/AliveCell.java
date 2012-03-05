package gameoflife;

import gameoflife.Cell;
import gameoflife.DeadCell;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;

@SuppressWarnings("all")
public class AliveCell extends Cell {
  public static AliveCell aliveCell() {
    AliveCell _aliveCell = new AliveCell();
    return _aliveCell;
  }
  
  public Cell evolve(final int neighbourCount) {
    boolean _or = false;
    boolean _underPopulated = this.underPopulated(neighbourCount);
    if (_underPopulated) {
      _or = true;
    } else {
      boolean _overpopulated = this.overpopulated(neighbourCount);
      _or = BooleanExtensions.operator_or(_underPopulated, _overpopulated);
    }
    if (_or) {
      DeadCell _deadCell = DeadCell.deadCell();
      return _deadCell;
    }
    AliveCell _aliveCell = AliveCell.aliveCell();
    return _aliveCell;
  }
  
  public boolean underPopulated(final int neighbourCount) {
    boolean _lessThan = IntegerExtensions.operator_lessThan(neighbourCount, 2);
    return _lessThan;
  }
  
  public boolean overpopulated(final int neighbourCount) {
    boolean _greaterThan = IntegerExtensions.operator_greaterThan(neighbourCount, 3);
    return _greaterThan;
  }
}
